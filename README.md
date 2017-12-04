最近一段时间阅读一些优秀的项目源代码，也学习了非常好的项目结构规划，TemplateSSM就是来源于此的记录，并且会长期跟进，不断完善

TemplateSSM具有以下特点：

* 结构清晰
* DAO层通过MyBatis Generator实现自动化构建
* Service层通过BaseService实现高度代码复用


操作实例：

1. `template-common` 模块中 `util/AESUtil` 执行 `main` 生成 mysql 的加密密码，填入`template-dao` 的 `resource/generator.properties` 中 (generator.properties.example 去掉后缀 .example)
2. `template-dao` 模块中 `Generator` 执行 main
3. enjoy it !

