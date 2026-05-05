import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UseCase15Test {

    @Test
    void testSafeCargo() {
        UseCase15TrainConsistMgmt.GoodsBogie b =
                new UseCase15TrainConsistMgmt.GoodsBogie("Cylindrical");

        b.assignCargo("Petroleum");

        assertEquals("Petroleum", b.cargo);
    }

    @Test
    void testUnsafeCargo() {
        UseCase15TrainConsistMgmt.GoodsBogie b =
                new UseCase15TrainConsistMgmt.GoodsBogie("Rectangular");

        b.assignCargo("Petroleum");

        assertNull(b.cargo);
    }
}