package jdbc;

public class DAOTest {

    public static void main(String[] args) {
        DAO dao = new DAO();
        String sql = "INSERT INTO pessoas (name) VALUES (?)";
        System.out.println(dao.insert(sql, "João da Silva"));
        System.out.println(dao.insert(sql, "Ana Júlia Santos"));
        System.out.println(dao.insert(sql, "Djalma Pereira"));

        dao.closeConnection();
    }

}
