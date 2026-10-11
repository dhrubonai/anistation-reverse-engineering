package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class na0 extends InputStream {
    public final /* synthetic */ byte x;
    public final Object y;

    public na0(t94 t94Var) {
        this.x = (byte) 1;
        this.y = t94Var.x.slice();
    }

    @Override // java.io.InputStream
    public int available() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return (int) Math.min(((pa0) obj).y, 2147483647L);
            case 1:
                return ((ByteBuffer) obj).remaining();
            case 2:
                xy4 xy4Var = (xy4) obj;
                if (!xy4Var.z) {
                    return (int) Math.min(xy4Var.y.y, 2147483647L);
                }
                qi2.k("closed");
                return 0;
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.x) {
            case 0:
                return;
            case 1:
            default:
                super.close();
                return;
            case 2:
                ((xy4) this.y).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        switch (this.x) {
            case 1:
                ((ByteBuffer) this.y).mark();
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        switch (this.x) {
            case 1:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                bArr.getClass();
                return ((pa0) obj).read(bArr, i, i2);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int min = Math.min(i2, byteBuffer.remaining());
                byteBuffer.get(bArr, i, min);
                return min;
            case 2:
                bArr.getClass();
                xy4 xy4Var = (xy4) obj;
                pa0 pa0Var = xy4Var.y;
                if (!xy4Var.z) {
                    tl7.m(bArr.length, i, i2);
                    if (pa0Var.y == 0 && xy4Var.x.j0(8192L, pa0Var) == -1) {
                        return -1;
                    }
                    return pa0Var.read(bArr, i, i2);
                }
                qi2.k("closed");
                return 0;
            case 3:
                Inflater inflater = (Inflater) ((w71) obj).y;
                try {
                    int inflate = inflater.inflate(bArr, i, i2);
                    if (inflate > 0) {
                        return inflate;
                    }
                    if (i2 == 0) {
                        return 0;
                    }
                    if (inflater.getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = inflater.getRemaining();
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 70 + String.valueOf(remaining).length());
                    sb.append("Read no bytes (requested up to ");
                    sb.append(i2);
                    sb.append(") but did not reach end of stream, had ");
                    sb.append(remaining);
                    throw new IOException(sb.toString());
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            default:
                return ((ze7) obj).f(bArr, i, i2);
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        switch (this.x) {
            case 1:
                try {
                    ((ByteBuffer) this.y).reset();
                    return;
                } catch (InvalidMarkException e) {
                    throw new IOException(e);
                }
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        int i;
        switch (this.x) {
            case 4:
                if (j <= 0) {
                    return 0L;
                }
                if (j > 2147483647L) {
                    i = Integer.MAX_VALUE;
                } else {
                    i = (int) j;
                }
                ((ze7) this.y).g(i);
                return i;
            default:
                return super.skip(j);
        }
    }

    public String toString() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return ((pa0) obj) + ".inputStream()";
            case 1:
            default:
                return super.toString();
            case 2:
                return ((xy4) obj) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) {
        switch (this.x) {
            case 2:
                outputStream.getClass();
                xy4 xy4Var = (xy4) this.y;
                pa0 pa0Var = xy4Var.y;
                if (!xy4Var.z) {
                    long j = 0;
                    while (true) {
                        if (pa0Var.y == 0 && xy4Var.x.j0(8192L, pa0Var) == -1) {
                            return j;
                        }
                        long j2 = pa0Var.y;
                        j += j2;
                        tl7.m(j2, 0L, j2);
                        zf5 zf5Var = pa0Var.x;
                        while (j2 > 0) {
                            zf5Var.getClass();
                            int min = (int) Math.min(j2, zf5Var.c - zf5Var.b);
                            outputStream.write(zf5Var.a, zf5Var.b, min);
                            int i = zf5Var.b + min;
                            zf5Var.b = i;
                            long j3 = min;
                            pa0Var.y -= j3;
                            j2 -= j3;
                            if (i == zf5Var.c) {
                                zf5 a = zf5Var.a();
                                pa0Var.x = a;
                                hg5.a(zf5Var);
                                zf5Var = a;
                            }
                        }
                    }
                } else {
                    qi2.k("closed");
                    return 0L;
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    public na0(w71 w71Var, ze7 ze7Var) {
        this.x = (byte) 4;
        this.y = ze7Var;
    }

    public /* synthetic */ na0(Closeable closeable, byte b) {
        this.x = b;
        this.y = closeable;
    }

    private final void a() {
    }

    @Override // java.io.InputStream
    public final int read() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                pa0 pa0Var = (pa0) obj;
                if (pa0Var.y > 0) {
                    return pa0Var.readByte() & 255;
                }
                return -1;
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & 255;
                }
                return -1;
            case 2:
                xy4 xy4Var = (xy4) obj;
                pa0 pa0Var2 = xy4Var.y;
                if (xy4Var.z) {
                    qi2.k("closed");
                    return 0;
                }
                if (pa0Var2.y == 0 && xy4Var.x.j0(8192L, pa0Var2) == -1) {
                    return -1;
                }
                return pa0Var2.readByte() & 255;
            case 3:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            default:
                byte[] bArr2 = new byte[1];
                if (((ze7) obj).f(bArr2, 0, 1) == -1) {
                    return -1;
                }
                return bArr2[0];
        }
    }
}
