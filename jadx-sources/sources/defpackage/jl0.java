package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jl0 {
    public final InputStream a;
    public final CharsetDecoder b;
    public final ByteBuffer c;
    public boolean d;
    public char e;

    public jl0(InputStream inputStream, Charset charset) {
        charset.getClass();
        this.a = inputStream;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        onUnmappableCharacter.getClass();
        this.b = onUnmappableCharacter;
        ByteBuffer wrap = ByteBuffer.wrap(ub0.c.c(8196));
        wrap.getClass();
        this.c = wrap;
        wrap.flip();
    }

    public final int a(char[] cArr, int i, int i2) {
        int i3;
        CharsetDecoder charsetDecoder;
        int i4;
        char c;
        if (i2 == 0) {
            return 0;
        }
        if (i >= 0 && i < cArr.length && i2 >= 0 && i + i2 <= cArr.length) {
            boolean z = this.d;
            boolean z2 = true;
            if (z) {
                cArr[i] = this.e;
                i++;
                i2--;
                this.d = false;
                if (i2 == 0) {
                    return 1;
                }
                z = false;
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i5 = -1;
            if (i2 == 1) {
                if (z) {
                    this.d = false;
                    c = this.e;
                } else {
                    char[] cArr2 = new char[2];
                    int a = a(cArr2, 0, 2);
                    if (a != -1) {
                        if (a != 1) {
                            if (a == 2) {
                                this.e = cArr2[1];
                                this.d = true;
                                c = cArr2[0];
                            } else {
                                p65.m(a, "Unreachable state: ");
                                return 0;
                            }
                        } else {
                            c = cArr2[0];
                        }
                    } else {
                        c = 65535;
                    }
                }
                if (c == 65535) {
                    if (i3 == 0) {
                        return -1;
                    }
                    return i3;
                }
                cArr[i] = c;
                return i3 + 1;
            }
            CharBuffer wrap = CharBuffer.wrap(cArr, i, i2);
            if (wrap.position() != 0) {
                wrap = wrap.slice();
            }
            CharBuffer charBuffer = wrap;
            boolean z3 = false;
            while (true) {
                charsetDecoder = this.b;
                ByteBuffer byteBuffer = this.c;
                CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z3);
                if (decode.isUnderflow()) {
                    if (z3 || !charBuffer.hasRemaining()) {
                        break;
                    }
                    byteBuffer.compact();
                    try {
                        int limit = byteBuffer.limit();
                        int position = byteBuffer.position();
                        if (position <= limit) {
                            i4 = limit - position;
                        } else {
                            i4 = 0;
                        }
                        int read = this.a.read(byteBuffer.array(), byteBuffer.arrayOffset() + position, i4);
                        if (read >= 0) {
                            byteBuffer.position(position + read);
                            byteBuffer.flip();
                            read = byteBuffer.remaining();
                        }
                        if (read < 0) {
                            if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                                break;
                            }
                            charsetDecoder.reset();
                            z3 = true;
                        } else {
                            continue;
                        }
                    } finally {
                        byteBuffer.flip();
                    }
                } else {
                    if (decode.isOverflow()) {
                        charBuffer.position();
                        break;
                    }
                    decode.throwException();
                }
            }
            z2 = z3;
            if (z2) {
                charsetDecoder.reset();
            }
            if (charBuffer.position() != 0) {
                i5 = charBuffer.position();
            }
            return i5 + i3;
        }
        ze0.i(qx1.u("Unexpected arguments: ", i, ", ", i2, ", "), cArr.length);
        return 0;
    }
}
