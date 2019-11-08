package cn.edu.xcu.demo.autogeneratorcode;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CodeGenerator {
	public static void main(String[] args) {
		//全局配置
		GlobalConfig globalConfig = new GlobalConfig();
		globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");//告诉代码放在那里
		globalConfig.setAuthor("jobob");
		globalConfig.setOpen(false);
		//配置datasource
		DataSourceConfig dataSourceConfig = new DataSourceConfig();
		dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/new_schema?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Hongkong&allowPublicKeyRetrieval=true");
		dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
		dataSourceConfig.setUsername("root");
		dataSourceConfig.setPassword("dmh128121");
		//自定义代码模板
		//指定自定义模板路径, 位置：/resources/templates/entity2.java.ftl(或者是.vm)
		//注意不要带上.ftl(或者是.vm), 会根据使用的模板引擎自动识别
		TemplateConfig templateConfig=new TemplateConfig();
		//自定义属性注入
		InjectionConfig injectionConfig = new InjectionConfig() {
		    //自定义属性注入:abc
		    //在.ftl(或者是.vm)模板中，通过${cfg.abc}获取属性
		    @Override
		    public void initMap() {
		       
		    }
		};
		AutoGenerator ag = new AutoGenerator();
		//配置包
		PackageConfig packageConfig=new PackageConfig();
		packageConfig.setParent("cn.edu.xcu.demo");
		//生成策略配置
		StrategyConfig strategyConfig=new StrategyConfig();
		strategyConfig.setTablePrefix("t_");//告诉它t_是表名的前缀，生成后不要t_
		strategyConfig.setNaming(NamingStrategy.underline_to_camel);//命名规则配置
		
		//配置自定义属性注入
		ag.setGlobalConfig(globalConfig);//注入全局配置
		ag.setDataSource(dataSourceConfig);//注入datasource
		ag.setTemplate(templateConfig);//注入自定义代码模板
		ag.setCfg(injectionConfig);//注入自定义属性
		ag.setPackageInfo(packageConfig);
		ag.setStrategy(strategyConfig);
		ag.execute();//执行
	}
}
