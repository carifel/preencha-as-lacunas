/* Copyright 2013 Universidade Estadual Paulista
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.unesp.igce.lacunas;

/**
 * gera um titulo de ficcao para filme ou livro.
 * 
 * duas partes: um nome feminino e um adjetivo no estilo western.
 * 
 * @author orlando
 */
public class GeradorDeTituloDeFiccao {
    
    private static String[] nomes = {
        "Fuga ",
        "Viagem ",
        "Cilada ",
        "Jornada ",
        "Armadilha ",
        "Noite "
    };
    
    private static String[] adjetivos = {
        "Sangrenta",
        "dos Desesperados",
        "Fatal",
        "do Barba Ruiva",
        "dos Bravos",
        "do Heroi"
    };
    
    /**
     * @return um nome feminino seguido de adjetivo no estilo western.
     */
    public static String prox() {
        
        ExpressaoGeradora exp = new ExpressaoGeradora(1);
        exp.colar(new ParteSorteada(nomes));
        exp.colar(new ParteSorteada(adjetivos));
        
        ExpressaoGeradora[] ops = {exp};
        Gerador g = new Gerador(ops);
        
        return g.prox();
    }
    
}
