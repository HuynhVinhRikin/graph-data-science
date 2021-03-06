/*
 * Copyright (c) 2017-2020 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.gds.embeddings.randomprojections;

import org.neo4j.graphalgo.AlgoBaseProc;
import org.neo4j.graphalgo.api.NodeProperties;
import org.neo4j.graphalgo.api.nodeproperties.FloatArrayNodeProperties;

final class RandomProjectionCompanion {

    static final String DESCRIPTION = "Random Projection produces node embeddings via the fastrp algorithm";

    private RandomProjectionCompanion() {}

    static <CONFIG extends RandomProjectionBaseConfig> NodeProperties getNodeProperties(AlgoBaseProc.ComputationResult<RandomProjection, RandomProjection, CONFIG> computationResult) {
        return (FloatArrayNodeProperties) nodeId -> computationResult.result().embeddings().get(nodeId);
    }
}
