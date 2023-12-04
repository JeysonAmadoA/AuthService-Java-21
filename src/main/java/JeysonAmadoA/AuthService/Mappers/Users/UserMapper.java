package JeysonAmadoA.AuthService.Mappers.Users;

import JeysonAmadoA.AuthService.Dto.Users.UserDto;
import JeysonAmadoA.AuthService.Entities.Users.UserEntity;
import JeysonAmadoA.AuthService.Mappers.BaseMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends BaseMapper<UserDto, UserEntity> {

    public UserMapper() {
        super(UserDto.class, UserEntity.class);
    }
}
