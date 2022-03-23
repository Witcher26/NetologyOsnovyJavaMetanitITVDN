# NetologyOsnovyJavaMetanitITVDN
Задачи блока основ Java, лекции, Метанит и ITVDN
***
Основы джава:
- 3 ***Условные операторы и циклы***
- Задача 3.1 - високосный год (тернарный оператор, цикл while(true),Scanner)
- Задача 3.2 - угадываем високостность (тернарный оператор, scanner.nextInt())
- 4 ***Типы данных в Java:примитивы***
- Задача 4 - из квиза (String EndPhrase = "закончу в", String regex = "\\d{2}\\:\\d{2}")
- Задача 4.1 - ИПэшник (if(userNumber.equalsIgnoreCase("end")) 
- Задача 4.2 - Сравнение double - Сравнить, округлить, отбросить дробную часть (тернар.оператор, while(true), switch - case,Float.parseFloat,  if (Math.abs(userNumber1 - userNumber2) <= 0.00001) { //если погрешность не больше(или равна) 1=й-миллионой,то считаем числа равными, Double.parseDouble(scanner.nextLine()),
- 5 ***Типы данных в Java: объекты*** квиз https://netology.ru/profile/program/jdpdc-java-3/lessons/119467/lesson_items/608815
- 6 ***Структура класса***
- Задача 6.1 - Книги и авторы
- 7 ******массивы одномерные***
- Задача 7.1 - Покупка товаров ((new String[5])[0] = null, if (userValue.equals("end")), String[] value = userValue.split(" "), if (userBin[i] != 0))
- 8 ***массивы многомерные***
- Задача 8.1 - поворот матрицы (private static int[][] matrix = new int[SIZE][SIZE], matrix[i][j] = random.nextInt(256),  matrixNew[i][j] = matrix[SIZE - 1 - j][i])
- Задача 8.2 - игра крестики-нолики (boolean isTrue = false,  public static boolean isWinForAll(char[][] field, char player),  if (countRow == SIZE || countColumn == SIZE || countDiagonalMain == SIZE || countDiagonalSide == SIZE) isTrue = true)
- 9 ***квиз - модификаторы доступа и наследование: https://netology.ru/profile/program/jdpdc-java-3/lessons/119472/lesson_items/608840                
- 10 ***Полиморфизм***                
- Задача 10.1 - Задача от бухгалтеров (System.out.println(0.1 + 0.2); // => 0.30000000000000004 
- Задача 10.2 - Задача от бухгалтеров на BigDecimal
- Задача 10.3 - Игра шутер (наследование классов и переопределение методов)
- 11 ***Абстракции и интерфейсы***
- Задача 11.1 - Библиотека (реализация интерфейсов, интерфейс в параметрах-обычный класс,который реализует интерфейс)
- Задача 11.2 - Банковские счета (абстрактный класс, вызов базового конструктора, boolean метод return getBalance() + amount <= 0)
- 12 ***Исключения, Stacktrace***
- генерация своих исключений  
- Задача 12.1 - Проверка доступа к ресурсу генерация различных исключений, валидация по возрасту, логину и паролю, User[] users = getUsers())
- Задача 12.2 - Валидация прочитанных событий (if (event.getTitle() != null && event.getReleaseYear() != 0 && event.getAge() != 0)
- ***квиз "Genaric в коллекциях и методах"*** https://netology.ru/profile/program/jdpdc-java-3/lessons/119477/lesson_items/608865
- 13 ***Коллекции List***   
- Задача 13.1 - Записная книга (list.add(scanner.nextLine())), if(userValue==1))
- 14 ***Коллекции Queue***
- Задача 14.1 - Лифт (Queue<Integer> queue = new ArrayDeque<>(), catch (InputMismatchException ex), while (!queue.isEmpty()) 
- Задача 14.2 - Время движения лифта (currentFloor = queue.poll(), totalSeconds += Math.abs(previousFloor - currentFloor) * waitMoveInSeconds,  throw new InputMismatchException())
- Задача 14.3 - Обратная польская запись (Deque<String> queue = new ArrayDeque<>(),String[] line = userValue.split(" "),  String s = queue.pollLast())
- 15 ***Коллекции HashSet и HashMap***
- Задача 15.1 - Телефонный справочник (public int hashCode() {return Objects.hash(phoneNumber, name, lastname), private Map<String, List<Contact>> groups = new HashMap<>(), **groups.get(nameGroup).add(contact)**, List<Contact> tmpContact = entry.getValue(), **if (groups.get(nameGroup).contains(contact))**)
- Задача 15.2 - Список студентов (System.out.println(storage.isEmpty() ? messageStart : messageNext),  if (userValue.equals("end")),String message = addStudent(studentTmp) ? "Студент добавлен" : "Такой студент уже есть",  public int hashCode() {
return Objects.hash(studentId), public String toString() {return name + " , " + group + " , " + studentId )
- 16 ***Коллекции TreeMap и TreeSet***
- Задача 16.1 - Пропущенные вызовы (Map<LocalDateTime, String> missedCalls = new TreeMap<>(), return Long.toString((long) ((Math.random() * (MAX - MiN)) + MiN)))
- задача 16.2 - Система подбора кандидатов ( public int compareTo(Candidate altCandidate) {int result = altCandidate.relevance.compareTo(relevance);if (result == 0) {result = altCandidate.ratio.compareTo(ratio);if (result == 0) {return this.relevance;}}return result)
  ***
Лекции Netology
 - HashSet и HashMap
 - Радиус и площадь
 - Пузырьковая сортировка
 - Игра крестики-нолики
 - Абстракции
 - Квиз - Орки против Людей
 - TreeMap
 - Дженерики
 - Исключения
   - Несоответствие ввода
   - Выброс своих исключений
   - Исключения при чтении файла
   - Отложенная обработка
 - Коллекции List
 - Ссылки на методы
 
 ***
 ITVDV
 - клонирование
 - сериализация
 ***
 Metanit
 - record
 ***
 -вывод процесса прогресса
 - создание своей аннотации
 
