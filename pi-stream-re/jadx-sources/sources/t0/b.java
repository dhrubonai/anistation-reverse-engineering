package t0;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: e, reason: collision with root package name */
    public static final ByteOrder f9954e = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: f, reason: collision with root package name */
    public static final ByteOrder f9955f = ByteOrder.BIG_ENDIAN;

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f9956a;

    /* renamed from: b, reason: collision with root package name */
    public ByteOrder f9957b;

    /* renamed from: c, reason: collision with root package name */
    public int f9958c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f9959d;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public final void a(int i10) {
        int i11 = 0;
        while (i11 < i10) {
            DataInputStream dataInputStream = this.f9956a;
            int i12 = i10 - i11;
            int skip = (int) dataInputStream.skip(i12);
            if (skip <= 0) {
                if (this.f9959d == null) {
                    this.f9959d = new byte[8192];
                }
                skip = dataInputStream.read(this.f9959d, 0, Math.min(8192, i12));
                if (skip == -1) {
                    throw new EOFException(a3.g.o("Reached EOF while skipping ", i10, " bytes."));
                }
            }
            i11 += skip;
        }
        this.f9958c += i11;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f9956a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f9958c++;
        return this.f9956a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f9958c++;
        return this.f9956a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f9958c++;
        int read = this.f9956a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f9958c += 2;
        return this.f9956a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i10, int i11) {
        this.f9958c += i11;
        this.f9956a.readFully(bArr, i10, i11);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f9958c += 4;
        DataInputStream dataInputStream = this.f9956a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f9957b;
            if (byteOrder == f9954e) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f9955f) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f9957b);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f9958c += 8;
        DataInputStream dataInputStream = this.f9956a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f9957b;
            if (byteOrder == f9954e) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f9955f) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f9957b);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f9958c += 2;
        DataInputStream dataInputStream = this.f9956a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f9957b;
            if (byteOrder == f9954e) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f9955f) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f9957b);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f9958c += 2;
        return this.f9956a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f9958c++;
        return this.f9956a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f9958c += 2;
        DataInputStream dataInputStream = this.f9956a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f9957b;
            if (byteOrder == f9954e) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f9955f) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f9957b);
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i10) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        this.f9957b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f9956a = dataInputStream;
        dataInputStream.mark(0);
        this.f9958c = 0;
        this.f9957b = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f9956a.read(bArr, i10, i11);
        this.f9958c += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f9958c += bArr.length;
        this.f9956a.readFully(bArr);
    }
}
