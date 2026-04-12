package io.github.sgtswagrid.structures
package ordered.builder

import io.github.sgtswagrid.structures.evidence.{
  BigIntIsOrderedEuclideanRing, IntIsOrderedEuclideanRing,
  LongIsOrderedEuclideanRing, ShortIsOrderedEuclideanRing,
}
import io.github.sgtswagrid.structures.ordered.OrderedEuclideanRing

/** Methods for constructing [[OrderedEuclideanRing]] type classes. */
trait OrderedEuclideanRingBuilder
  extends OrderedFieldBuilder,
          ShortIsOrderedEuclideanRing,
          IntIsOrderedEuclideanRing,
          LongIsOrderedEuclideanRing,
          BigIntIsOrderedEuclideanRing
