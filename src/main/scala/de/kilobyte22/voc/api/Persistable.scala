package de.kilobyte22.voc.api

import de.kilobyte22.binaryformat.wrapper.HashTag

trait Persistable {
  def load(tag: HashTag)

  def save(tag: HashTag)
}

