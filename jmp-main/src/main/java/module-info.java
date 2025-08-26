module jmp.main {
    requires jmp.cloud.bank.impl;
    requires jmp.cloud.service.impl;
    requires jmp.dto;
    requires jmp.bank.api;        // Додано для доступу до edu.hneu.mjt.andrii.bank.api
    requires jmp.service.api;     // Додано для доступу до edu.hneu.mjt.andrii.service.api
}