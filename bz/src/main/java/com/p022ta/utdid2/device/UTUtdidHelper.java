package com.p022ta.utdid2.device;

import com.p022ta.utdid2.p024b.p025a.AESUtils;
import com.p022ta.utdid2.p024b.p025a.C1049b;
import java.util.Random;

/* renamed from: com.ta.utdid2.device.d */
public class UTUtdidHelper {

    /* renamed from: a */
    private static Random f878a = new Random();

    /* renamed from: p */
    private String f879p;

    public UTUtdidHelper() {
        this.f879p = "XwYp8WL8bm6S4wu6yEYmLGy4RRRdJDIhxCBdk3CiNZTwGoj1bScVZEeVp9vBiiIsgwDtqZHP8QLoFM6o6MRYjW8QqyrZBI654mqoUk5SOLDyzordzOU5QhYguEJh54q3K1KqMEXpdEQJJjs1Urqjm2s4jgPfCZ4hMuIjAMRrEQluA7FeoqWMJOwghcLcPVleQ8PLzAcaKidybmwhvNAxIyKRpbZlcDjNCcUvsJYvyzEA9VUIaHkIAJ62lpA3EE3H";
        this.f879p = C1049b.encodeToString("XwYp8WL8bm6S4wu6yEYmLGy4RRRdJDIhxCBdk3CiNZTwGoj1bScVZEeVp9vBiiIsgwDtqZHP8QLoFM6o6MRYjW8QqyrZBI654mqoUk5SOLDyzordzOU5QhYguEJh54q3K1KqMEXpdEQJJjs1Urqjm2s4jgPfCZ4hMuIjAMRrEQluA7FeoqWMJOwghcLcPVleQ8PLzAcaKidybmwhvNAxIyKRpbZlcDjNCcUvsJYvyzEA9VUIaHkIAJ62lpA3EE3H".getBytes(), 2);
    }

    /* renamed from: c */
    public String mo12988c(byte[] bArr) {
        return AESUtils.m664d(this.f879p, C1049b.encodeToString(bArr, 2));
    }

    /* renamed from: a */
    public String mo12986a(String str) {
        return AESUtils.m664d(this.f879p, str);
    }

    /* renamed from: b */
    public String mo12987b(String str) {
        return AESUtils.m665e(this.f879p, str);
    }
}
