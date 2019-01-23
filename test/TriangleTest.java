import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test //Fail
    void isScalene_3DiffrentSides_True() {

        //Arrange
        Triangle triangle = new Triangle(2.0, 3.0, 4.0);

        //Act
        boolean scalene = triangle.isScalene();

        //Assert
        assertTrue(scalene);

    }

    @Test //OK
    void isScalene_2SidesWithSameLength_False() {
        Triangle triangle = new Triangle(2.0, 2.0, 3.0);
        assertFalse(triangle.isScalene());
    }

    @Test
    void isEquilateral_3SidesDiffrentLength_False() {
        Triangle triangle = new Triangle( 2.0,3.0,9);
        assertFalse(triangle.isEquilateral());
    }

    @Test //OK
    void isEquilateral_2SidesWithSameLength_False() {
        Triangle triangle = new Triangle(3.0,3.0,8.0);
        assertFalse(triangle.isEquilateral());
    }

    @Test //Fail
    void isEquilateral_3SameSideLength_True() {
        Triangle triangle = new Triangle(3.0,3.0,3.0);
        assertTrue(triangle.isEquilateral());
    }

    @Test //OK
    void isIsosceles_3SameSideLength_False() {
        Triangle triangle = new Triangle(6.0,6.0,6.0);
        assertFalse(triangle.isIsosceles());
    }

    @Test //OK
    void isIscsceles_2SameSideLegth_True() {
        Triangle triangle = new Triangle(2.0,2.0, 7.0);
        assertTrue(triangle.isIsosceles());
    }

    @Test
    void Triangle_PointConstructor_sides() {
        Triangle triangle = new Triangle(new Point(0,0), new Point(4,0), new Point(2,4));

        //assertEquals(4.0, triangle.sides[0], 0.1);
        //assertEquals(4.472, triangle.sides[1], 0.001);
        //assertEquals(4.472, triangle.sides[2], 0.001);

        double[] expected = new double[]{4.0,4.472,4.472};
        assertArrayEquals( expected, triangle.sides, 0.001);
    }
}