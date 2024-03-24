package gang.atoz.serverminecraft.config

import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class SwaggerConfig {
    @Bean
    fun openAPI(): OpenAPI {
        return OpenAPI()
            .components(Components())
            .info(apiInfo())
    }

    private fun apiInfo(): Info {
        return Info()
            .title("알룬 코틑린 API") // API의 제목
            .description("알룬 서버에 벡앤드 api입니다.") // API에 대한 설명
            .version("1.0.0") // API의 버전
    }
}