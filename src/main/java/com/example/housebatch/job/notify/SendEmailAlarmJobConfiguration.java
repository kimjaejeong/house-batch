//package com.example.housebatch.job.notify;
//
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.batch.api.chunk.ItemReader;
//import javax.sql.DataSource;
//
//@Slf4j
//@RequiredArgsConstructor
//@Configuration
//public class SendEmailAlarmJobConfiguration {
//    private final JobBuilderFactory jobBuilderFactory;
//    private final StepBuilderFactory stepBuilderFactory;
//    private final DataSource dataSource;
//
//    private static final int CHUNK_SIZE = 4;
//
//    @Bean
//    public Job sendEmailAlarmJob(
//            Step sendScheduleAlarmStep,
//            Step sendEngagementAlarmStep
//    ) {
//        return jobBuilderFactory.get("sendEmailAlarmJob")
//                .start(sendScheduleAlarmStep)
//                .next(sendEngagementAlarmStep)
//                .build();
//    }
//
//    @Bean
//    public Step sendScheduleAlarmStep(
//            ItemReader<Schedule> sendScheduleAlarmReader,
//            ItemWriter<Schedule> sendScheduleAlarmWriter
//    ) {
//        return stepBuilderFactory.get("sendScheduleAlarmStep")
//                .<Schedule, Schedule>chunk(CHUNK_SIZE)
//                .reader(sendScheduleAlarmReader)
//                .writer(sendScheduleAlarmWriter)
//                .allowStartIfComplete(true)
//                .build();
//    }
//
//    @Bean
//    public Step sendEngagementAlarmStep(
//            ItemReader<Engagement> sendEngagementAlarmReader,
//            ItemWriter<Engagement> sendEngagementAlarmWriter
//    ) {
//        return stepBuilderFactory.get("sendScheduleAlarmStep")
//                .<Engagement, Engagement>chunk(CHUNK_SIZE)
//                .reader(sendEngagementAlarmReader)
//                .writer(sendEngagementAlarmWriter)
//                .allowStartIfComplete(true)
//                .build();
//    }
//}
