package com.example.SpringFunction.SpringCloudFunction.WebPackage;

import com.example.SpringFunction.SpringCloudFunction.payload.RequestData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class WebFunctions {

    @Bean
    public Supplier<String> sayHello()
    {
        return()->{
            return "Hello guys!";
        };
    }

    @Bean
    public Consumer<RequestData> inputData()
    {
        return (inputData)->{

            //processing..
            System.out.println(inputData.getName());
            System.out.println(inputData.getContact());
        };
    }

    @Bean
    public Function<RequestData,String> submitData(){
        return (inputData)->{
            return "Data Submitted "+inputData.getName();
        };
    }
}
