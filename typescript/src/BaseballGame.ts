export enum Play {
    OUT,
    STRIKE,
    BALL,
    HOMERUN,
    SINGLE,
    DOUBLE,
    TRIPLE,
    STEAL,
    SACRIFICE_OUT
}

export class BaseballGame {
    public play(event: Play) {
        // todo
    }

    public score(): [number, number] {
        return [0, 0]
    }
}
