package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cz0 implements dz0 {
    public final /* synthetic */ byte a;

    public /* synthetic */ cz0(byte b) {
        this.a = b;
    }

    @Override // defpackage.dz0
    public final long a(long j, long j2) {
        switch (this.a) {
            case 0:
                float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i = bb5.a;
                return floatToRawIntBits;
            case 1:
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                int i2 = bb5.a;
                return floatToRawIntBits2;
            case 2:
                float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
                int i3 = bb5.a;
                return floatToRawIntBits3;
            case 3:
                float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat4) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
                int i4 = bb5.a;
                return floatToRawIntBits4;
            case 4:
                float F = a34.F(j, j2);
                long floatToRawIntBits5 = (Float.floatToRawIntBits(F) << 32) | (Float.floatToRawIntBits(F) & 4294967295L);
                int i5 = bb5.a;
                return floatToRawIntBits5;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long floatToRawIntBits6 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i6 = bb5.a;
                    return floatToRawIntBits6;
                }
                float F2 = a34.F(j, j2);
                long floatToRawIntBits7 = (Float.floatToRawIntBits(F2) << 32) | (Float.floatToRawIntBits(F2) & 4294967295L);
                int i7 = bb5.a;
                return floatToRawIntBits7;
        }
    }
}
