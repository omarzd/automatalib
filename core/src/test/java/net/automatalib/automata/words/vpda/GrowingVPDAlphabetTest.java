/* Copyright (C) 2013-2017 TU Dortmund
 * This file is part of AutomataLib, http://www.automatalib.net/.
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
package net.automatalib.automata.words.vpda;

import java.util.List;

import net.automatalib.automata.words.util.DefaultVPDAlphabetTestUtil;
import net.automatalib.automata.words.util.GrowingVPDAlphabetTestUtil;
import net.automatalib.words.VPDAlphabet;
import net.automatalib.words.impl.GrowingVPDAlphabet;
import net.automatalib.words.impl.VPDSym;

/**
 * @author frohme
 */
public class GrowingVPDAlphabetTest extends AbstractVPDAlphabetTest<VPDSym<Character>, GrowingVPDAlphabet<Character>> {

    @Override
    protected List<VPDSym<Character>> getCallSymbols() {
        return GrowingVPDAlphabetTestUtil.CALL_SYMBOLS;
    }

    @Override
    protected List<VPDSym<Character>> getInternalSymbols() {
        return GrowingVPDAlphabetTestUtil.INTERNAL_SYMBOLS;
    }

    @Override
    protected List<VPDSym<Character>> getReturnSymbols() {
        return GrowingVPDAlphabetTestUtil.RETURN_SYMBOLS;
    }

    @Override
    protected List<VPDSym<Character>> getNonAlphabetSymbols() {
        return GrowingVPDAlphabetTestUtil.NON_CONTAINED_SYMBOLS;
    }

    @Override
    protected GrowingVPDAlphabet<Character> getAlphabet() {
        final GrowingVPDAlphabet<Character> result = new GrowingVPDAlphabet<>();

        DefaultVPDAlphabetTestUtil.INTERNAL_SYMBOLS.forEach(s -> result.addNewSymbol(s,
                                                                                     VPDAlphabet.SymbolType.INTERNAL));
        DefaultVPDAlphabetTestUtil.CALL_SYMBOLS.forEach(s -> result.addNewSymbol(s, VPDAlphabet.SymbolType.CALL));
        DefaultVPDAlphabetTestUtil.RETURN_SYMBOLS.forEach(s -> result.addNewSymbol(s, VPDAlphabet.SymbolType.RETURN));

        return result;
    }
}