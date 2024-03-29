package com.example.pharmacy.pharmacy.service

import com.example.pharmacy.pharmacy.cache.PharmacyRedisTemplateService
import com.example.pharmacy.pharmacy.entity.Pharmacy
import spock.lang.Specification
import spock.lang.Subject

class PharmacySearchServiceTest extends Specification {

    @Subject
    private PharmacySearchService pharmacySearchService

    private PharmacyRepositoryService pharmacyRepositoryService = Mock()
    private PharmacyRedisTemplateService pharmacyRedisTemplateService = Mock()

    private List<Pharmacy> pharmacyList

    def setup() {
        pharmacySearchService = new PharmacySearchService(pharmacyRepositoryService, pharmacyRedisTemplateService)

        pharmacyList = Lists.newArrayList(
                Pharmacy.builder()
                        .id(1L)
                        .pharmacyName("호수온누리약국")
                        .latitude(37.60894036)
                        .longitude(127.029052)
                        .build(),
                Pharmacy.builder()
                        .id(2L)
                        .pharmacyName("돌곶이온누리약국")
                        .latitude(37.61040424)
                        .longitude(127.0569046)
                        .build()
        )
    }

    def "searchPharmacyDtoList convert pharmacyList to pharmacyDtoList"() {
        when:
        pharmacyRepositoryService.findAll() >> pharmacyList
        def result = pharmacySearchService.searchPharmacyDtoList()

        then:
        result.size() == 2
        result.get(0).getId() == 1
        result.get(0).getPharmacyName() == "호수온누리약국"
        result.get(1).getId() == 2
        result.get(1).getPharmacyName() == "돌곶이온누리약국"
    }

    def "searchPharmacyDtoList return empty list if pharmacyList is empty"() {
        when:
        pharmacyRepositoryService.findAll() >> []
        def result = pharmacySearchService.searchPharmacyDtoList()

        then:
        result.size() == 0
        result.empty
    }

    def "레디스 장애시 DB를 이용 하여 약국 데이터 조회"() {

        when:
        pharmacyRedisTemplateService.findAll() >> []  // 빈 리스트가 호출되도록 setup
        pharmacyRepositoryService.findAll() >> pharmacyList // db에 해당 리스트만 들어있도록 setup

        def result = pharmacySearchService.searchPharmacyDtoList()

        then:
        result.size() == 2
    }
}
