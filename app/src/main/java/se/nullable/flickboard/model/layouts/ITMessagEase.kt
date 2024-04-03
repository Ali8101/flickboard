package se.nullable.flickboard.model.layouts

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import se.nullable.flickboard.model.Action
import se.nullable.flickboard.model.Direction
import se.nullable.flickboard.model.KeyM
import se.nullable.flickboard.model.Layer
import se.nullable.flickboard.model.Layout
import se.nullable.flickboard.ui.FlickBoardParent
import se.nullable.flickboard.ui.Keyboard

val IT_MESSAGEASE_MAIN_LAYER = Layer(
    keyRows = listOf(
        listOf(
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("a"),
                    Direction.TOP_RIGHT to Action.Text("à"),
                    Direction.BOTTOM_RIGHT to Action.Text("v")
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("n"),
                    Direction.BOTTOM to Action.Text("h")
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("i"),
                    Direction.TOP_LEFT to Action.Text("ì"),
                    Direction.BOTTOM_LEFT to Action.Text("x")
                )
            ),
        ),
        listOf(
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("l"),
                    Direction.TOP to Action.Text("ù"),
                    Direction.RIGHT to Action.Text("k"),
                    Direction.BOTTOM to Action.Text("ò")
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("o"),
                    Direction.TOP_LEFT to Action.Text("q"),
                    Direction.TOP to Action.Text("u"),
                    Direction.TOP_RIGHT to Action.Text("p"),
                    Direction.LEFT to Action.Text("c"),
                    Direction.RIGHT to Action.Text("b"),
                    Direction.BOTTOM_LEFT to Action.Text("g"),
                    Direction.BOTTOM to Action.Text("d"),
                    Direction.BOTTOM_RIGHT to Action.Text("j"),
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("r"),
                    Direction.LEFT to Action.Text("m"),
                )
            ),
        ),
        listOf(
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("t"),
                    Direction.TOP to Action.Text("ó"),
                    Direction.TOP_RIGHT to Action.Text("y"),
                    Direction.RIGHT to Action.Text("è")
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("e"),
                    Direction.TOP to Action.Text("w"),
                    Direction.LEFT to Action.Text("é"),
                    Direction.RIGHT to Action.Text("z")
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("s"),
                    Direction.TOP_LEFT to Action.Text("f")
                )
            ),
        ),
        listOf(SPACE)
    )
)

val IT_MESSAGEASE = Layout(
    mainLayer = IT_MESSAGEASE_MAIN_LAYER,
    controlLayer = CONTROL_MESSAGEASE_LAYER
)

@Composable
@Preview
fun ItKeyboardPreview() {
    FlickBoardParent {
        Keyboard(layout = Layout(IT_MESSAGEASE_MAIN_LAYER), onAction = {})
    }
}

@Composable
@Preview
fun ItFullKeyboardPreview() {
    FlickBoardParent {
        Keyboard(layout = IT_MESSAGEASE, showAllModifiers = true, onAction = {})
    }
}
