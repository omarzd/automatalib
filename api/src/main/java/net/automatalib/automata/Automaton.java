/* Copyright (C) 2013 TU Dortmund
 * This file is part of AutomataLib, http://www.automatalib.net/.
 * 
 * AutomataLib is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 3.0 as published by the Free Software Foundation.
 * 
 * AutomataLib is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with AutomataLib; if not, see
 * http://www.gnu.de/documents/lgpl.en.html.
 */
package net.automatalib.automata;

import java.util.Collection;

import net.automatalib.automata.graphs.AutomatonGraphView;
import net.automatalib.automata.graphs.TransitionEdge;
import net.automatalib.automata.simple.SimpleAutomaton;
import net.automatalib.graphs.Graph;
import net.automatalib.ts.TransitionSystem;


/**
 * Basic interface for an automaton. An automaton is a {@link TransitionSystem}
 * with a finite number of states.
 * 
 * @author Malte Isberner 
 *
 * @param <S> state class.
 * @param <I> input symbol class.
 * @param <T> transition class.
 */
public interface Automaton<S,I,T> 
        extends TransitionSystem<S,I,T>, SimpleAutomaton<S,I> {
	
	default public Graph<S,TransitionEdge<I,T>> transitionGraphView(Collection<? extends I> inputs) {
		return AutomatonGraphView.create(this, inputs);
	}
}