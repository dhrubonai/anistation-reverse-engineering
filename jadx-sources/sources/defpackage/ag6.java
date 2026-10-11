package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ag6 extends f30 {
    public final /* synthetic */ byte i;

    public /* synthetic */ ag6(byte b) {
        this.i = b;
    }

    public static void m(int i, ByteBuffer byteBuffer) {
        int floatToIntBits;
        float f = (float) (i * 4.656612875245797E-10d);
        if (Float.isNaN(f)) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // defpackage.f30
    public final vv a(vv vvVar) {
        switch (this.i) {
            case 0:
                int i = vvVar.c;
                if (eq6.N(i)) {
                    if (i != 4) {
                        return new vv(vvVar.a, vvVar.b, 4);
                    }
                    return vv.e;
                }
                throw new yv(vvVar);
            default:
                int i2 = vvVar.c;
                if (eq6.N(i2)) {
                    if (i2 != 2) {
                        return new vv(vvVar.a, vvVar.b, 2);
                    }
                    return vv.e;
                }
                throw new yv(vvVar);
        }
    }

    @Override // defpackage.zv
    public final void g(ByteBuffer byteBuffer) {
        ByteBuffer l;
        switch (this.i) {
            case 0:
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                int i = limit - position;
                int i2 = this.b.c;
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 21) {
                            if (i2 != 22) {
                                if (i2 != 268435456) {
                                    if (i2 != 1342177280) {
                                        if (i2 != 1610612736) {
                                            if (i2 != 1879048192) {
                                                if (i2 != 1895825408) {
                                                    if (i2 == 1912602624) {
                                                        l = l(i / 2);
                                                        while (position < limit) {
                                                            l.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(position))));
                                                            position += 8;
                                                        }
                                                    } else {
                                                        p65.l();
                                                        return;
                                                    }
                                                } else {
                                                    l = l(i);
                                                    while (position < limit) {
                                                        l.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(position))));
                                                        position += 4;
                                                    }
                                                }
                                            } else {
                                                l = l(i / 2);
                                                while (position < limit) {
                                                    l.putFloat((float) byteBuffer.getDouble(position));
                                                    position += 8;
                                                }
                                            }
                                        } else {
                                            l = l(i);
                                            while (position < limit) {
                                                m(Integer.reverseBytes(byteBuffer.getInt(position)), l);
                                                position += 4;
                                            }
                                        }
                                    } else {
                                        l = l((i / 3) * 4);
                                        while (position < limit) {
                                            m(jf7.w(byteBuffer.get(position), byteBuffer.get(position + 1), byteBuffer.get(position + 2), (byte) 0), l);
                                            position += 3;
                                        }
                                    }
                                } else {
                                    l = l(i * 2);
                                    while (position < limit) {
                                        m(Short.reverseBytes(byteBuffer.getShort(position)) << 16, l);
                                        position += 2;
                                    }
                                }
                            } else {
                                l = l(i);
                                while (position < limit) {
                                    m(byteBuffer.getInt(position), l);
                                    position += 4;
                                }
                            }
                        } else {
                            l = l((i / 3) * 4);
                            while (position < limit) {
                                m(jf7.w(byteBuffer.get(position + 2), byteBuffer.get(position + 1), byteBuffer.get(position), (byte) 0), l);
                                position += 3;
                            }
                        }
                    } else {
                        l = l(i * 4);
                        while (position < limit) {
                            m(((byteBuffer.get(position) & 255) - 128) << 24, l);
                            position++;
                        }
                    }
                } else {
                    l = l(i * 2);
                    while (position < limit) {
                        m(byteBuffer.getShort(position) << 16, l);
                        position += 2;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                l.flip();
                return;
            default:
                int position2 = byteBuffer.position();
                int limit2 = byteBuffer.limit();
                int i3 = limit2 - position2;
                int i4 = this.b.c;
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 21) {
                            if (i4 != 22) {
                                if (i4 != 268435456) {
                                    if (i4 != 1342177280) {
                                        if (i4 != 1610612736) {
                                            if (i4 != 1879048192) {
                                                if (i4 != 1895825408) {
                                                    if (i4 != 1912602624) {
                                                        p65.l();
                                                        return;
                                                    }
                                                }
                                            }
                                            i3 /= 4;
                                        }
                                    }
                                }
                            }
                        }
                        i3 = (i3 / 3) * 2;
                    }
                    i3 /= 2;
                } else {
                    i3 *= 2;
                }
                ByteBuffer l2 = l(i3);
                int i5 = this.b.c;
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 21) {
                            if (i5 != 22) {
                                if (i5 != 268435456) {
                                    if (i5 != 1342177280) {
                                        if (i5 != 1610612736) {
                                            if (i5 != 1879048192) {
                                                if (i5 != 1895825408) {
                                                    if (i5 == 1912602624) {
                                                        while (position2 < limit2) {
                                                            short max = (short) (Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(position2))), 1.0d)) * 32767.0d);
                                                            l2.put((byte) (max & 255));
                                                            l2.put((byte) ((max >> 8) & 255));
                                                            position2 += 8;
                                                        }
                                                    } else {
                                                        p65.l();
                                                        return;
                                                    }
                                                } else {
                                                    while (position2 < limit2) {
                                                        short i6 = (short) (eq6.i(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(position2))), -1.0f, 1.0f) * 32767.0f);
                                                        l2.put((byte) (i6 & 255));
                                                        l2.put((byte) ((i6 >> 8) & 255));
                                                        position2 += 4;
                                                    }
                                                }
                                            } else {
                                                while (position2 < limit2) {
                                                    short max2 = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(position2), 1.0d)) * 32767.0d);
                                                    l2.put((byte) (max2 & 255));
                                                    l2.put((byte) ((max2 >> 8) & 255));
                                                    position2 += 8;
                                                }
                                            }
                                        } else {
                                            while (position2 < limit2) {
                                                l2.put(byteBuffer.get(position2 + 1));
                                                l2.put(byteBuffer.get(position2));
                                                position2 += 4;
                                            }
                                        }
                                    } else {
                                        while (position2 < limit2) {
                                            l2.put(byteBuffer.get(position2 + 1));
                                            l2.put(byteBuffer.get(position2));
                                            position2 += 3;
                                        }
                                    }
                                } else {
                                    while (position2 < limit2) {
                                        l2.put(byteBuffer.get(position2 + 1));
                                        l2.put(byteBuffer.get(position2));
                                        position2 += 2;
                                    }
                                }
                            } else {
                                while (position2 < limit2) {
                                    l2.put(byteBuffer.get(position2 + 2));
                                    l2.put(byteBuffer.get(position2 + 3));
                                    position2 += 4;
                                }
                            }
                        } else {
                            while (position2 < limit2) {
                                l2.put(byteBuffer.get(position2 + 1));
                                l2.put(byteBuffer.get(position2 + 2));
                                position2 += 3;
                            }
                        }
                    } else {
                        while (position2 < limit2) {
                            short i7 = (short) (eq6.i(byteBuffer.getFloat(position2), -1.0f, 1.0f) * 32767.0f);
                            l2.put((byte) (i7 & 255));
                            l2.put((byte) ((i7 >> 8) & 255));
                            position2 += 4;
                        }
                    }
                } else {
                    while (position2 < limit2) {
                        l2.put((byte) 0);
                        l2.put((byte) ((byteBuffer.get(position2) & 255) - 128));
                        position2++;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                l2.flip();
                return;
        }
    }
}
