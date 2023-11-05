import {BaseballGame, Play} from '../src/BaseballGame'

describe('BaseballGame', () => {
  it('homerun', () => {
    const game = new BaseballGame()
    game.play(Play.HOMERUN)
    expect(game.score()).toEqual([1,0])
  })
})
