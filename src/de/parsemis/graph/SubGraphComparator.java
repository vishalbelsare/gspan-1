/**
 * created May 29, 2006
 *
 * @by Marc Woerlein (woerlein@informatik.uni-erlangen.de)
 * <p>
 * Copyright 2006 Marc Woerlein
 * <p>
 * This file is part of de.parsemis.
 * <p>
 * Licence:
 * LGPL: http://www.gnu.org/licenses/lgpl.html
 * EPL: http://www.eclipse.org/org/documents/epl-v10.php
 * See the LICENSE file in the project's top-level directory for details.
 */
package de.parsemis.graph;

/**
 * Compares a subgraph and a graph for structural and label equality.
 *
 * @author Marc Woerlein (woerlein@informatik.uni-erlangen.de)
 *
 * @param <NodeType>
 *            the type of the node labels (will be hashed and checked with
 *            .equals(..))
 * @param <EdgeType>
 *            the type of the edge labels (will be hashed and checked with
 *            .equals(..))
 */
public class SubGraphComparator<NodeType, EdgeType> extends
        AbstractGraphComparator<NodeType, EdgeType> {

    /**
     *
     */
    private static final long serialVersionUID = 4569262162987977275L;

    /**
     * precondition for subgraph equality
     *
     * @param graphA
     * @param graphB
     * @return <code>true</code>, if the graphs are same sized, otherwise
     *         <code>false</code>
     */
    @Override
    protected boolean precondition(final Graph<NodeType, EdgeType> graphA,
                                   final Graph<NodeType, EdgeType> graphB) {
        return (graphA.getNodeCount() <= graphB.getNodeCount() && graphA
                .getEdgeCount() <= graphB.getEdgeCount());
    }
}
