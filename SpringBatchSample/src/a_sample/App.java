package a_sample;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {

        String[] springConfig = { "jobConfig.xml" };

        ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");

        Job job = (Job) context.getBean("helloWorldJob");

        JobExecution execution = jobLauncher.run(job, new JobParameters());
        System.out.println("ID : " + execution.getId());
        System.out.println("jobID : " + execution.getJobId());
        System.out.println("Exit Status : " + execution.getStatus());

    }

}
