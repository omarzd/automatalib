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
package net.automatalib.graphs.concepts;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

import net.automatalib.graphs.Graph;

/**
 * Edge label context, for {@link Graph}s with labeled edges.
 *
 * @param <E>
 *         edge class
 * @param <L>
 *         label class
 *
 * @author Malte Isberner
 */
@ParametersAreNonnullByDefault
public interface EdgeLabels<E, L> {

    /**
     * Retrieves the label for an edge.
     *
     * @param edge
     *         the edge
     *
     * @return the label for the given edge
     */
    @Nullable
    L getEdgeLabel(E edge);
}