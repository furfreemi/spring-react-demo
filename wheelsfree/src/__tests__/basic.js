const sum = (a, b) => a + b;

beforeEach(() => {
    expect.hasAssertions();
});

describe('Basic', () => {
    test('it should return correct sum number', () => {
        // given
        const a = 1;
        const b = 2;

        // when
        const result = sum(1, 2);

        //then
        expect(result).toBe(3);
    });
})
