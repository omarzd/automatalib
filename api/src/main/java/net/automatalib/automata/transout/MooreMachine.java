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
package net.automatalib.automata.transout;

import net.automatalib.automata.UniversalDeterministicAutomaton;
import net.automatalib.automata.concepts.StateOutput;

public interface MooreMachine<S, I, T, O> extends UniversalDeterministicAutomaton<S, I, T, O, Void>,
                                                  StateOutput<S, O>,
                                                  TransitionOutputAutomaton<S, I, T, O> {

    @Override
    default O getStateProperty(S state) {
        return getStateOutput(state);
    }

    @Override
    default Void getTransitionProperty(T transition) {
        return null;
    }

    @Override
    default O getTransitionOutput(T transition) {
        return getStateOutput(getSuccessor(transition));
    }
}
