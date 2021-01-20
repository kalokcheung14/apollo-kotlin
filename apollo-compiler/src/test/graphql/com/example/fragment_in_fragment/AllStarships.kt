// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_in_fragment

import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.Query
import com.apollographql.apollo.api.internal.QueryDocumentMinifier
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.example.fragment_in_fragment.adapter.AllStarships_ResponseAdapter
import com.example.fragment_in_fragment.fragment.PilotFragment
import com.example.fragment_in_fragment.fragment.PlanetFragment
import com.example.fragment_in_fragment.fragment.StarshipFragment
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
class AllStarships : Query<AllStarships.Data> {
  override fun operationId(): String = OPERATION_ID

  override fun queryDocument(): String = QUERY_DOCUMENT

  override fun variables(): Operation.Variables = Operation.EMPTY_VARIABLES

  override fun name(): String = OPERATION_NAME

  override fun adapter(): ResponseAdapter<Data> = AllStarships_ResponseAdapter
  data class Data(
    val allStarships: AllStarships?
  ) : Operation.Data {
    /**
     * A connection to a list of items.
     */
    data class AllStarships(
      /**
       * A list of edges.
       */
      val edges: List<Edge?>?
    ) {
      fun edgesFilterNotNull(): List<Edge>? = edges?.filterNotNull()

      /**
       * An edge in a connection.
       */
      data class Edge(
        /**
         * The item at the end of the edge
         */
        val node: Node?
      ) {
        /**
         * A single transport craft that has hyperdrive capability.
         */
        interface Node {
          val __typename: String

          interface Starship : Node, StarshipFragment {
            override val __typename: String

            /**
             * The ID of an object
             */
            override val id: String

            /**
             * The name of this starship. The common name, such as "Death Star".
             */
            override val name: String?

            override val pilotConnection: PilotConnection?

            /**
             * A connection to a list of items.
             */
            interface PilotConnection : StarshipFragment.PilotConnection {
              /**
               * A list of edges.
               */
              override val edges: List<Edge?>?

              /**
               * An edge in a connection.
               */
              interface Edge : StarshipFragment.PilotConnection.Edge {
                /**
                 * The item at the end of the edge
                 */
                override val node: Node?

                /**
                 * An individual person or character within the Star Wars universe.
                 */
                interface Node : StarshipFragment.PilotConnection.Edge.Node {
                  override val __typename: String

                  interface Person : Node, PilotFragment,
                      StarshipFragment.PilotConnection.Edge.Node.Person,
                      StarshipFragment.PilotConnection.Edge.Node {
                    override val __typename: String

                    /**
                     * The name of this person.
                     */
                    override val name: String?

                    /**
                     * A planet that this person was born on or inhabits.
                     */
                    override val homeworld: Homeworld?

                    /**
                     * A large mass, planet or planetoid in the Star Wars Universe, at the time of
                     * 0 ABY.
                     */
                    interface Homeworld : PilotFragment.Homeworld,
                        StarshipFragment.PilotConnection.Edge.Node.Person.Homeworld {
                      override val __typename: String

                      interface Planet : Homeworld, PlanetFragment, PilotFragment.Homeworld.Planet,
                          PilotFragment.Homeworld,
                          StarshipFragment.PilotConnection.Edge.Node.Person.Homeworld.Planet,
                          StarshipFragment.PilotConnection.Edge.Node.Person.Homeworld {
                        override val __typename: String

                        /**
                         * The name of this planet.
                         */
                        override val name: String?
                      }

                      companion object {
                        fun Homeworld.asPlanet(): Planet? = this as? Planet

                        fun Homeworld.planetFragment(): PlanetFragment? = this as? PlanetFragment
                      }
                    }
                  }

                  companion object {
                    fun Node.asPerson(): Person? = this as? Person

                    fun Node.pilotFragment(): PilotFragment? = this as? PilotFragment
                  }
                }
              }
            }
          }

          data class StarshipNode(
            override val __typename: String,
            /**
             * The ID of an object
             */
            override val id: String,
            /**
             * The name of this starship. The common name, such as "Death Star".
             */
            override val name: String?,
            override val pilotConnection: PilotConnection?
          ) : Node, Starship, StarshipFragment {
            /**
             * A connection to a list of items.
             */
            data class PilotConnection(
              /**
               * A list of edges.
               */
              override val edges: List<Edge?>?
            ) : Starship.PilotConnection, StarshipFragment.PilotConnection {
              /**
               * An edge in a connection.
               */
              data class Edge(
                /**
                 * The item at the end of the edge
                 */
                override val node: Node?
              ) : Starship.PilotConnection.Edge, StarshipFragment.PilotConnection.Edge {
                /**
                 * An individual person or character within the Star Wars universe.
                 */
                interface Node : Starship.PilotConnection.Edge.Node,
                    StarshipFragment.PilotConnection.Edge.Node {
                  override val __typename: String

                  data class PersonNode(
                    override val __typename: String,
                    /**
                     * The name of this person.
                     */
                    override val name: String?,
                    /**
                     * A planet that this person was born on or inhabits.
                     */
                    override val homeworld: Homeworld?
                  ) : Starship.PilotConnection.Edge.Node, Starship.PilotConnection.Edge.Node.Person,
                      PilotFragment, StarshipFragment.PilotConnection.Edge.Node.Person,
                      StarshipFragment.PilotConnection.Edge.Node, Node {
                    /**
                     * A large mass, planet or planetoid in the Star Wars Universe, at the time of
                     * 0 ABY.
                     */
                    interface Homeworld : Starship.PilotConnection.Edge.Node.Person.Homeworld,
                        PilotFragment.Homeworld,
                        StarshipFragment.PilotConnection.Edge.Node.Person.Homeworld {
                      override val __typename: String

                      data class PlanetHomeworld(
                        override val __typename: String,
                        /**
                         * The name of this planet.
                         */
                        override val name: String?
                      ) : Starship.PilotConnection.Edge.Node.Person.Homeworld,
                          Starship.PilotConnection.Edge.Node.Person.Homeworld.Planet,
                          PlanetFragment, PilotFragment.Homeworld.Planet, PilotFragment.Homeworld,
                          StarshipFragment.PilotConnection.Edge.Node.Person.Homeworld.Planet,
                          StarshipFragment.PilotConnection.Edge.Node.Person.Homeworld, Homeworld

                      data class OtherHomeworld(
                        override val __typename: String
                      ) : Starship.PilotConnection.Edge.Node.Person.Homeworld,
                          PilotFragment.Homeworld,
                          StarshipFragment.PilotConnection.Edge.Node.Person.Homeworld, Homeworld
                    }
                  }

                  data class OtherNode(
                    override val __typename: String
                  ) : Starship.PilotConnection.Edge.Node,
                      StarshipFragment.PilotConnection.Edge.Node, Node
                }
              }
            }
          }

          data class OtherNode(
            override val __typename: String
          ) : Node

          companion object {
            fun Node.asStarship(): Starship? = this as? Starship

            fun Node.starshipFragment(): StarshipFragment? = this as? StarshipFragment
          }
        }
      }
    }
  }

  companion object {
    const val OPERATION_ID: String =
        "3d7fa8ee44e23f44c0605c01b0db776614b2dd3d78541751c50cb04d9ba4c4cc"

    val QUERY_DOCUMENT: String = QueryDocumentMinifier.minify(
          """
          |query AllStarships {
          |  allStarships(first: 7) {
          |    edges {
          |      node {
          |        __typename
          |        ...starshipFragment
          |      }
          |    }
          |  }
          |}
          |fragment starshipFragment on Starship {
          |  __typename
          |  id
          |  name
          |  pilotConnection {
          |    edges {
          |      node {
          |        __typename
          |        ...pilotFragment
          |      }
          |    }
          |  }
          |}
          |fragment pilotFragment on Person {
          |  __typename
          |  name
          |  homeworld {
          |    __typename
          |    ...planetFragment
          |  }
          |}
          |fragment planetFragment on Planet {
          |  __typename
          |  name
          |}
          """.trimMargin()
        )

    val OPERATION_NAME: String = "AllStarships"
  }
}