//package com.example.housebatch.core.service;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.io.IOException;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Optional;
//
//@Slf4j
//@Service
//@Transactional
//@RequiredArgsConstructor
//public class BranchProcessService {
//    @Value("${path.hr-file.root}")
//    private String hrFileRoot;
//
//    @Value("${path.hr-file.branch}")
//    private String branchFileName;
//
//    public void process() {
//        load();
//        transform();
//    }
//
//    public void load() {
//        try {
//            Path path = Paths.get(hrFileRoot, branchFileName);
//            List<BranchRaw> branchRaws = Files.lines(path, Charset.forName("euc-kr"))
//                    .map(line -> line.trim().concat("|DUMMY").split("\\|"))
//                    .map(BranchRaw::new)
//                    .toList();
//
//            branchRawRepository.initUseYnBeforeLoad();
//            branchRaws.forEach(branchRaw -> {
//                Optional<BranchRaw> optionalBranchRaw = branchRawRepository.findById(branchRaw.get인사부점코드());
//                if (optionalBranchRaw.isPresent()) {
//                    optionalBranchRaw.get().apply(branchRaw);
//                } else {
//                    branchRawRepository.save(branchRaw);
//                }
//            });
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//이 코드를 Spring Batch 형태로 바꿔줘
