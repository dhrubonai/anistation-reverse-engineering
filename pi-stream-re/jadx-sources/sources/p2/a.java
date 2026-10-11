package p2;

import c1.p0;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q6.e;
import r6.h0;

/* loaded from: classes.dex */
public final class a extends h0 {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f8543i = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: g, reason: collision with root package name */
    public final CharsetDecoder f8544g = e.f9207c.newDecoder();

    /* renamed from: h, reason: collision with root package name */
    public final CharsetDecoder f8545h = e.f9206b.newDecoder();

    @Override // r6.h0
    public final p0 H(l2.a aVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f8545h;
        CharsetDecoder charsetDecoder2 = this.f8544g;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new p0(new c(null, null, bArr));
        }
        Matcher matcher = f8543i.matcher(str);
        String str3 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String g02 = j5.a.g0(group);
                g02.getClass();
                if (!g02.equals("streamurl")) {
                    if (g02.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new p0(new c(str2, str3, bArr));
    }
}
