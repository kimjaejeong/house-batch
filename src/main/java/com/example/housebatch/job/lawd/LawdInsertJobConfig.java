//package com.example.housebatch.job.lawd;
//
//import com.example.housebatch.core.entity.Lawd;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.JobScope;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.core.launch.support.RunIdIncrementer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@RequiredArgsConstructor
//@Slf4j
//public class LawdInsertJobConfig {
//
//    @Autowired
//    private final JobBuilderFactory jobBuilderFactory;
//
//    @Autowired
//    private final StepBuilderFactory stepBuilderFactory;
//
//    @Bean
//    public Job lawdInsertJob() {
//        return jobBuilderFactory.get("lawdInsertJob")
//                .incrementer(new RunIdIncrementer())
//                .validator()
//                .start(lawdInsertStep)
//                .build();
//    }
//
//
//    // 데이터 양이 많기 때문에 chunk 단위로 잘라서 진행
//    @JobScope
//    @Bean
//    public Step lawdInsertStep() {
//        return stepBuilderFactory.get("lawdInsertStep")
//                .<Lawd, Lawd>chunk(1000)
//                .reader()
//                .writer()
//                .build();
//
//    }
//}
