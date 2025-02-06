package com.carnasa.cr.mergerequestbackend.service.utils;

import com.carnasa.cr.mergerequestbackend.entities.ProgrammingLanguage;
import com.carnasa.cr.mergerequestbackend.models.ProgrammingLanguageDTO;

public class ProgrammingLanguageUtils {

    public static ProgrammingLanguageDTO toDTO(ProgrammingLanguage programmingLanguage){
        return new ProgrammingLanguageDTO(
                programmingLanguage.getName(),
                programmingLanguage.getLogo()
        );
    }
}
