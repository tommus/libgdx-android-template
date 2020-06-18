package co.windly.androidgametemplate

import android.os.Bundle
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import ktx.app.KtxApplicationAdapter

class AndroidGameTemplate : AndroidApplication(), KtxApplicationAdapter {

  //region Lifecycle

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    // Prepare game engine configuration.
    val config = AndroidApplicationConfiguration()

    // Initialize the game.
    initialize(this, config)
  }

  //endregion

  //region Game Loop

  override fun render() {
    super.render()

    // Fill the background.
    Gdx.gl.glClearColor(1f, 0f, 0f, 1f)
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

    // Draw the sample image.
    batch.begin()
    batch.draw(image, 0f, 0f)
    batch.end()
  }

  override fun dispose() {
    super.dispose()

    // Dispose the resources.
    batch.dispose()
    image.dispose()
  }

  //endregion

  //region Sample

  private val image
    by lazy { Texture("badlogic.jpg") }

  //endregion

  //region Sprite Batch

  private val batch
    by lazy { SpriteBatch() }

  //endregion
}
