# NetologyOsnovyJavaMetanitITVDN
Задачи блока основ Java, лекции, Метанит и ITVDN
***
Основы джава:
- Задача 3.1 - высокосный год (тернарный оператор, цикл while(true),Scanner)
- Задача 3.2 - укадываем високостность (ттернарный оператор, scanner.nextInt())
- Задача 4 - квиз. (String EndPhrase = "закончу в", String regex = "\\d{2}\\:\\d{2}")
- Задача 4.1 - ИПэшник (if(userNumber.equalsIgnoreCase("end")) 
- Задача 4.2 - Сравнить, округлить,  Отбросить дробную часть (тернар.оператор, while(true), switch - case,Float.parseFloat,  if (Math.abs(userNumber1 - userNumber2) <= 0.00001) { //если погрешность не больше(или равна) 1=й-миллионой,то считаем числа равными, Double.parseDouble(scanner.nextLine()),
- Задача 5 - квиз по теме "Типы данных в Java. Объекты" https://netology.ru/profile/program/jdpdc-java-3/lessons/119467/lesson_items/608815
- Задача 6.1 - Книги и авторы
- Задача 7.1 - Покупка товаров ((new String[5])[0] = null, if (userValue.equals("end")), String[] value = userValue.split(" "), if (userBin[i] != 0))
- Задача 8.1 - поворот матрицы ( private static int[][] matrix = new int[SIZE][SIZE], matrix[i][j] = random.nextInt(256),  matrixNew[i][j] = matrix[SIZE - 1 - j][i];)
- Задача 8.2 - игра крестики-нолики, (boolean isTrue = false,  public static boolean isWinForAll(char[][] field, char player),  if (countRow == SIZE || countColumn == SIZE || countDiagonalMain == SIZE || countDiagonalSide == SIZE)
                isTrue = true,
 - Задача 10.1    - Задача от бухгалтеров (System.out.println(0.1 + 0.2); // => 0.30000000000000004, 
 - Задача 10.2 -  - Задача от бухгалтеров на BigDecimal
 - Задача 10.3 - Игра шутер - наследование классов и переопределение методов
 - Задача 11.1 - Библиотека (реализация Интерфейсов, интерфейс в параметрах-это обычный класс,который реализует интерфейс)
- Задача 11.2 - Банковские счета - абстрактный класс, вызов базового конструктора, boolean метод return getBalance() + amount <= 0)
- Задача 12 - генерация своих исключений  
- Задача 12.1 - Проверка доступа к ресурсу (ненерация различных исключений, валидация по возрасту, логину и паролю, User[] users = getUsers())
- Задача 12.2 - Валидация прочитанных событий (if (event.getTitle() != null && event.getReleaseYear() != 0 && event.getAge() != 0),   
- Задача 13.1 - ***Коллекции List***. Записная книга (list.add(scanner.nextLine())), if(userValue==1))
- Задача 14.1 - **Коллекции Queue**. Лифт(Queue<Integer> queue = new ArrayDeque<>(),  } catch (InputMismatchException ex),  while (!queue.isEmpty()), 
- Задача 14.2 - Время движения лифта (currentFloor = queue.poll(), totalSeconds += Math.abs(previousFloor - currentFloor) * waitMoveInSeconds,  throw new InputMismatchException())
  - Задача 14.3  Обратная польская запись (Deque<String> queue = new ArrayDeque<>(), **  String[] line = userValue.split(" "),  String s = queue.pollLast())
  - Задача 15.1 **Коллекции HashSet и HashMap** Телефонный справочник (public int hashCode() {
        return Objects.hash(phoneNumber, name, lastname), private Map<String, List<Contact>> groups = new HashMap<>(), **groups.get(nameGroup).add(contact)**, List<Contact> tmpContact = entry.getValue(), **if (groups.get(nameGroup).contains(contact))**)
  - Задача 15.2 Список студентов (  System.out.println(storage.isEmpty() ? messageStart : messageNext),  if (userValue.equals("end")),String message = addStudent(studentTmp) ? "Студент добавлен" : "Такой студент уже есть",  public int hashCode() {
        return Objects.hash(studentId), public String toString() {
        return name + " , " + group + " , " + studentId )
 - Задача 16 **Коллекции TreeMap и TreeSet**
  - Задача 16.1 Пропущенные вызовы (Map<LocalDateTime, String> missedCalls = new TreeMap<>(), return Long.toString((long) ((Math.random() * (MAX - MiN)) + MiN)))
  - задача 16.2 Система подбора кандидатов ( public int compareTo(Candidate altCandidate) {
        int result = altCandidate.relevance.compareTo(relevance);
        if (result == 0) {
            result = altCandidate.ratio.compareTo(ratio);
            if (result == 0) {
                return this.relevance;
            }
        }
        return result)
