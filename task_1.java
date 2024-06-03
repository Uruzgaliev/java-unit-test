@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	
    
    assertEquals("Возрвст пользователя должен быть больше 18 лет", 18, isAdult); 
}
