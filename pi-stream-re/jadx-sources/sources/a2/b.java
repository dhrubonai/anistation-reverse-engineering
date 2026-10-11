package a2;

import a3.g;
import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f32a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f33b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f34c;

    /* renamed from: d, reason: collision with root package name */
    public static long f35d;

    public static long a() {
        DatagramSocket datagramSocket;
        synchronized (f33b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                datagramSocket = datagramSocket2;
            } else {
                long j4 = currentTimeMillis / 1000;
                Long.signum(j4);
                long j10 = currentTimeMillis - (j4 * 1000);
                long j11 = j4 + 2208988800L;
                bArr[40] = (byte) (j11 >> 24);
                bArr[41] = (byte) (j11 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j11 >> 8);
                    bArr[43] = (byte) (j11 >> 0);
                    long j12 = (j10 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j12 >> 24);
                    bArr[45] = (byte) (j12 >> 16);
                    bArr[46] = (byte) (j12 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j13 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
            byte b10 = bArr[0];
            int i10 = bArr[1] & 255;
            long d10 = d(bArr, 24);
            long d11 = d(bArr, 32);
            long d12 = d(bArr, 40);
            b((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i10, d12);
            long j14 = (j13 + (((d12 - j13) + (d11 - d10)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j14;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static void b(byte b10, byte b11, int i10, long j4) {
        if (b10 != 3) {
            if (b11 != 4 && b11 != 5) {
                throw new IOException(g.n("SNTP: Untrusted mode: ", b11));
            }
            if (i10 != 0 && i10 <= 15) {
                if (j4 != 0) {
                    return;
                } else {
                    throw new IOException("SNTP: Zero transmitTime");
                }
            }
            throw new IOException(g.n("SNTP: Untrusted stratum: ", i10));
        }
        throw new IOException("SNTP: Unsynchronized server");
    }

    public static long c(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    public static long d(byte[] bArr, int i10) {
        long c6 = c(bArr, i10);
        long c10 = c(bArr, i10 + 4);
        if (c6 == 0 && c10 == 0) {
            return 0L;
        }
        return ((c10 * 1000) / 4294967296L) + ((c6 - 2208988800L) * 1000);
    }
}
