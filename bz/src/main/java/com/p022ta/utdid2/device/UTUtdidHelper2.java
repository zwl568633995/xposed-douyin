package com.p022ta.utdid2.device;

import com.p022ta.utdid2.p024b.p025a.AESUtils;
import com.p022ta.utdid2.p024b.p025a.C1049b;
import com.p022ta.utdid2.p024b.p025a.C1055i;

/* renamed from: com.ta.utdid2.device.e */
public class UTUtdidHelper2 {

    /* renamed from: p */
    private String f880p;

    public UTUtdidHelper2() {
        this.f880p = "XwYp8WL8bm6S4wu6yEYmLGy4RRRdJDIhxCBdk3CiNZTwGoj1bScVZEeVp9vBiiIsgwDtqZHP8QLoFM6o6MRYjW8QqyrZBI654mqoUk5SOLDyzordzOU5QhYguEJh54q3K1KqMEXpdEQJJjs1Urqjm2s4jgPfCZ4hMuIjAMRrEQluA7FeoqWMJOwghcLcPVleQ8PLzAcaKidybmwhvNAxIyKRpbZlcDjNCcUvsJYvyzEA9VUIaHkIAJ62lpA3EE3H";
        this.f880p = C1049b.encodeToString("XwYp8WL8bm6S4wu6yEYmLGy4RRRdJDIhxCBdk3CiNZTwGoj1bScVZEeVp9vBiiIsgwDtqZHP8QLoFM6o6MRYjW8QqyrZBI654mqoUk5SOLDyzordzOU5QhYguEJh54q3K1KqMEXpdEQJJjs1Urqjm2s4jgPfCZ4hMuIjAMRrEQluA7FeoqWMJOwghcLcPVleQ8PLzAcaKidybmwhvNAxIyKRpbZlcDjNCcUvsJYvyzEA9VUIaHkIAJ62lpA3EE3H".getBytes(), 0);
    }

    /* renamed from: b */
    public String mo12989b(String str) {
        return AESUtils.m665e(this.f880p, str);
    }

    /* renamed from: c */
    public String mo12990c(String str) {
        String e = AESUtils.m665e(this.f880p, str);
        if (!C1055i.m676a(e)) {
            try {
                return new String(C1049b.decode(e, 0));
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
