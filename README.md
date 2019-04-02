# dt.conversion [![Build Status](https://travis-ci.org/DoublesunRUS/ru.capralow.dt.conversion.svg?branch=dev)](https://travis-ci.org/DoublesunRUS/ru.capralow.dt.conversion) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?branch=dev&project=DoublesunRUS_ru.capralow.dt.conversion&metric=alert_status)](https://sonarcloud.io/dashboard?id=DoublesunRUS_ru.capralow.dt.conversion&branch=dev) [![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?branch=dev&project=DoublesunRUS_ru.capralow.dt.conversion&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=DoublesunRUS_ru.capralow.dt.conversion&branch=dev) [![Coverage](https://sonarcloud.io/api/project_badges/measure?branch=dev&project=DoublesunRUS_ru.capralow.dt.conversion&metric=coverage)](https://sonarcloud.io/dashboard?id=DoublesunRUS_ru.capralow.dt.conversion&branch=dev)


## Конвертация данных для [1C:Enterprise Development Tools](http://v8.1c.ru/overview/IDE/) 1.10

Текущий релиз в ветке [master: 1.0.0](https://github.com/DoublesunRUS/ru.capralow.dt.conversion/tree/master).<br>
Разработка ведется в ветке [dev](https://github.com/DoublesunRUS/ru.capralow.dt.conversion/tree/dev).<br>

В данном репозитории хранятся только исходники.<br>

Плагин можно установить в EDT через пункт "Установить новое ПО" указав сайт обновления http://capralow.ru/edt/conversion/1.0.1/ .<br>
Для самостоятельной сборки плагина необходимо иметь доступ к сайту https://releases.1c.ru и настроить соответствующим образом Maven. Подробности настройки написаны [здесь](https://github.com/1C-Company/dt-example-plugins/blob/master/simple-plugin/README.md).<br>

### Редактор модуля обмена (dev)
При открытии общего модуля, если модуль пустой или есть Область "ПроцедурыКонвертации", то у редактора общего модуля появляется закладка "Конвертация".<br>
Внешний вид закладки похож на редактор конвертации в конфигурации 1С:Конвертация данных 3.<br>
Внутри правил доступен синтаксис контроль, контекстная подсказка и конструктор запроса.<br>
По умолчанию объекты сгруппированы по подсистемам.<br>
Сохранение изменений пока не работает. Нажатие в правилах на кнопку ОК **разрушит модуль**.<br>
Редактор читает и записывает только модуль в формате 2, формат 1 не тестировался.<br>

### Описание формата загрузки (dev)
Доступно формирование описания формата загрузки в виде markdown.<br>
По умолчанию на каждую версию формата строится описание формата от интерфейсных подсистем. Настройки позволяют задать нескольво вариантов описаний и произвольно сгруппировать объекты. Дополнительно можно включить вариант формирования описания, когда список объектов выводится в виде таблицы. Интерфейс для настроек пока не сделан. <br>
В качестве имен объектов конфигурации выводятся синонимы.<br>
Для каждого объекта формата выводится, по каким полям поиска ищется сопоставленный ему объект конфигурации.<br>
Ссылки на ключевые поля "разворачиваются" до полей, входящих в ключевые. Если поле составного типа, то ключевые поля отображаются для каждого типа отдельно.<br>
Для просмотра файла можно установить редактор [Typora](https://typora.io/).<br>

### Дополнительные проверки конфигурации (dev)
Проверяется что для указанных версий формата присутствуют пакеты XDTO.<br>
Для типов объектов пакета XDTO проверяется, что они наследуют тип Object.<br>

### Панель "Конвертация данных"
Панель паказывает, какие версии формата доступны для каждой конфигурации.<br>
Если в рабочей области больше одной конфигурации, панель для каждой пары конфигураций показывает какими форматами они могут обмениваться.<br>
