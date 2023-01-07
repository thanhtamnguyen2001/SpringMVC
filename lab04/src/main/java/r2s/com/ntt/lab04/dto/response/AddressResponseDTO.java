package r2s.com.demo.lab04.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddressResponseDTO implements Serializable {
    private int id;
    private String name;
    private String phone;
    private String province;
    private String district;
    private String street;
    private boolean type;
    private boolean defaultAddress;
    private boolean isDeleted;
    private int userId;
}
