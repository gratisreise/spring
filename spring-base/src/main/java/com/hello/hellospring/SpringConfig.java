package com.hello.hellospring;

import com.hello.hellospring.domain.Member;
import com.hello.hellospring.repository.JdbcMemberRepository;
import com.hello.hellospring.repository.MemberRepository;
import com.hello.hellospring.repository.MemoryMemberRepository;
import com.hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@Configuration
public class SpringConfig {

    public SpringConfig(DataSource dataSource){
        this.datasource = dataSource;
    }
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    @Bean
    public MemberRepository memberRepository(){
        return new JdbcMemberRepository(dataSource);
    }

}
