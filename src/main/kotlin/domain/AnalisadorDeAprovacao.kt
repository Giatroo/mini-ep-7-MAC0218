package domain

import domain.criterios.CriterioDeAprovacao
import domain.criterios.Basico

class AnalisadorDeAprovacao {
    private var criterio : CriterioDeAprovacao = Basico()

    fun defineCriterio(criterio: CriterioDeAprovacao) {
        this.criterio = criterio
    }

    fun fechaBoletim(boletim: Boletim) : BoletimFechado {
        val mediaEPs = boletim.mediaEPs
        val mediaMiniEPs = boletim.mediaMiniEPs
        val mediaFinal = this.criterio.mediaFinal(boletim)
        val foiAprovado = this.criterio.estaAprovado(boletim)


        return BoletimFechado(mediaEPs=mediaEPs, mediaMiniEPs=mediaMiniEPs, mediaFinal, foiAprovado)
    }

}
