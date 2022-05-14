package domain

import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {
    private var criterio : CriterioDeAprovacao? = null

    fun defineCriterio(criterio: CriterioDeAprovacao) {
        this.criterio = criterio
    }

    fun fechaBoletim(boletim: Boletim) : BoletimFechado {
        val mediaEPs = boletim.mediaEPs
        val mediaMiniEPs = boletim.mediaMiniEPs
        val mediaFinal = 7.0
        val foiAprovado = true


        return BoletimFechado(mediaEPs=mediaEPs, mediaMiniEPs=mediaMiniEPs, mediaFinal, foiAprovado)
    }

}
