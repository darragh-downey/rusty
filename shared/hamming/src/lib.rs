use std::os::raw::{c_char};
use std::ffi::{CString, CStr};
extern crate rand;

use rand::thread_rng;
use rand::Rng;

#[no_mangle]
pub extern fn rust_greeting(to: *const c_char) -> *mut c_char {
    let c_str = unsafe { CStr::from_ptr(to) };
    let recipient = match c_str.to_str() {
        Err(_) => "there",
        Ok(string) => string,
    };

    CString::new("Hello ".to_owned() + recipient).unwrap().into_raw()
}

#[no_mangle]
pub extern fn rust_greeting_free(s: *mut c_char) {
    unsafe {
        if s.is_null() { return }
        CString::from_raw(s)
    };
}


#[no_mangle]
pub extern fn rust_rando() -> i32 {
    let mut rng = thread_rng();
    let y: i32 = rng.gen_range(1..6);
    y
}

#[no_mangle]
pub extern fn rust_rando_free() {
    return
}