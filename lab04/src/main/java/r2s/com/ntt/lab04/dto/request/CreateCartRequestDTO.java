package r2s.com.demo.lab04.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCartRequestDTO implements Serializable {
    private int id;
    private int userId;



}
