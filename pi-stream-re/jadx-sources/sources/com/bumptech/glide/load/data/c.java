package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f2252a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f2253b;

    /* renamed from: c, reason: collision with root package name */
    public final y3.h f2254c;

    /* renamed from: d, reason: collision with root package name */
    public int f2255d;

    public c(FileOutputStream fileOutputStream, y3.h hVar) {
        this.f2252a = fileOutputStream;
        this.f2254c = hVar;
        this.f2253b = (byte[]) hVar.d(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OutputStream outputStream = this.f2252a;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f2253b;
            if (bArr != null) {
                this.f2254c.h(bArr);
                this.f2253b = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i10 = this.f2255d;
        OutputStream outputStream = this.f2252a;
        if (i10 > 0) {
            outputStream.write(this.f2253b, 0, i10);
            this.f2255d = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        byte[] bArr = this.f2253b;
        int i11 = this.f2255d;
        int i12 = i11 + 1;
        this.f2255d = i12;
        bArr[i11] = (byte) i10;
        if (i12 != bArr.length || i12 <= 0) {
            return;
        }
        this.f2252a.write(bArr, 0, i12);
        this.f2255d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f2255d;
            OutputStream outputStream = this.f2252a;
            if (i15 == 0 && i13 >= this.f2253b.length) {
                outputStream.write(bArr, i14, i13);
                return;
            }
            int min = Math.min(i13, this.f2253b.length - i15);
            System.arraycopy(bArr, i14, this.f2253b, this.f2255d, min);
            int i16 = this.f2255d + min;
            this.f2255d = i16;
            i12 += min;
            byte[] bArr2 = this.f2253b;
            if (i16 == bArr2.length && i16 > 0) {
                outputStream.write(bArr2, 0, i16);
                this.f2255d = 0;
            }
        } while (i12 < i11);
    }
}
