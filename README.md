# house-batch
house-batch를 위한 API입니다.

- 법정동 파일 다운로드
  - https://www.code.go.kr/index.do 에서 '법정동 코드 전체자료' 다운로드 후 resources 하위에 파일 두기
    - 파일명: LAWD_CODE.txt
- 공공데이터
  - 국토교통부_아파트매매_실거래자료
  - https://www.data.go.kr/iim/api/selectAPIAcountView.do
    - url: End Point
    - serviceKey: 일반 인증키(Encoding)
- 실행
```
- --spring.batch.job.names=lawdInsertJob -filePath=LAWD_CODE_SAMPLE.txt
- --spring.batch.job.names=aptDealInsertJob -lawdCd=41135 -yearMonth=2021-07
```