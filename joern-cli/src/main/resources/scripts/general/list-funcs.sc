/* list-funcs.scala

   This script simply returns a list of the names as String of all methods contained in the currently loaded CPG.

   Input: A valid CPG
   Output: scala.List[String]

   Running the Script
   ------------------
   see: README.md

   Sample Output
   -------------
   List("<operator>.indirectMemberAccess", "<operator>.assignment", "free_list", "free", "<operator>.notEquals")
 */

import io.shiftleft.joern.console.Console.cpg
import io.shiftleft.semanticcpg.language._

cpg.method.name.l
