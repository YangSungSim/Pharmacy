package com.example.pharmacy.pharmacy.repository

import com.example.pharmacy.AbstractIntegrationContainerBaseTest
import com.example.pharmacy.api.service.KakaoUriBuilderService
import com.example.pharmacy.pharmacy.entity.Pharmacy
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

class PharmacyRepositoryTest extends AbstractIntegrationContainerBaseTest {

//    private PharmacyRepository pharmacyRepository
//
//    // 테스트 시작 전 데이터 정리
//    void setup() {
//        pharmacyRepository.deleteAll()
//    }
//
//    def "PharmacyRepository save"() {
//
//        given:
//        String address = "서울 특별시 성북구 종암동"
//        String name = "은혜 약국"
//        double latitude = 36.11
//        double longitude = 128.11
//
//        def pharmacy = Pharmacy.builder()
//                .pharmacyAddress(address)
//                .pharmacyName(name)
//                .latitude(latitude)
//                .longitude(longitude)
//                .build()
//        when:
//            pharmacyRepository.save(pharmacy)
//        then:
//            def entity = pharmacyRepository.findAll()
//            entity.getPharmacyAddress() == address
//            entity.getPharmacyName() == name
//            entity.getLatitude() == latitude
//            entity.getLongitude() == longitude
//    }
//
//    def "PharmacyRepository saveAll"() {
//
//        given:
//        String address = "서울 특별시 성북구 종암동"
//        String name = "은혜 약국"
//        double latitude = 36.11
//        double longitude = 128.11
//
//        def pharmacy = Pharmacy.builder()
//                .pharmacyAddress(address)
//                .pharmacyName(name)
//                .latitude(latitude)
//                .longitude(longitude)
//                .build()
//        when:
//        pharmacyRepositoryService.saveAll(Arrays.asList(pharmacy))
//        def result = pharmacyRepository.findAll()
//
//        then:
//        result.get(0).getPharmacyAddress() == address
//        result.get(0).getPharmacyName() == name
//        result.get(0).getLatitude() == latitude
//        result.get(0).getLongitude() == longitude
//    }
//
//    def "PharmacyRepository delete"() {
//
//        given:
//        String address = "서울 특별시 성북구 종암동"
//        String name = "은혜 약국"
//
//        def pharmacy = Pharmacy.builder()
//                .pharmacyAddress(address)
//                .pharmacyName(name)
//                .build()
//        when:
//        def entity = pharmacyRepository.save(pharmacy)
//        pharmacyRepository.deleteById(entity.getId())
//
//        def result = pharmacyRepository.findAll()
//        then:
//        result.size() == 0
//    }
//
//    def "PharmacyRepository findById"() {
//
//        given:
//        String address = "서울 특별시 성북구 종암동"
//        String name = "은혜 약국"
//
//        def pharmacy = Pharmacy.builder()
//                .pharmacyAddress(address)
//                .pharmacyName(name)
//                .build()
//        when:
//        def entity = pharmacyRepository.save(pharmacy)
//        def result = pharmacyRepository.findById(entity.getId()).orElse(null)
//
//
//        then:
//        entity.getId() == result.getId()
//        entity.getPharmacyName() == result.getPharmacyName()
//        entity.getPharmacyAddress() == result.getPharmacyAddress()
//    }
//
//
//    def "BaseTimeEntity_등록"() {
//
//        given:
//        def now = LocalDateTime.now()
//        String address = "서울 특별시 성북구 종암동"
//        String name = "은혜 약국"
//
//        def pharmacy = Pharmacy.builder()
//                .pharmacyAddress(address)
//                .pharmacyName(name)
//                .build()
//        when:
//        pharmacyRepository.save(pharmacy)
//        def result = pharmacyRepository.findAll()
//        then:
//        result.get(0).getCreatedDate().isAfter(now)
//        result.get(0).getModifiedDate().isAfter(now)
//    }

}
