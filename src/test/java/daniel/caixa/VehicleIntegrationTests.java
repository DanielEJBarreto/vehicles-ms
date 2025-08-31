package daniel.caixa;

import daniel.caixa.Entity.Vehicle;
import daniel.caixa.Entity.VehicleStatus;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@QuarkusTest
public class VehicleServiceTests {

    //Testar todas as regras de negócio da classe Vehicle (mudança de status)
    private Vehicle mockAvailableVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setId(1L);
        vehicle.setStatus(VehicleStatus.AVAILABLE);
        return vehicle;
    }


}
