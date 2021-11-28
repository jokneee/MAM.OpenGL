// Zmniejszenie domyślnego poziomu precyzji.
precision mediump float;

// Zmienne przekazane z vertex shadera.
varying vec4 interpolatedColour;

void main()
{
    vec3 positionOfLight = vec3(0.0, 2.0, 1.0);
    vec4 colourOfLight = vec4(1.0, 1.0, 1.0, 1.0);

    // Przypisanie koloru fragmentowi obrazu.
    gl_FragColor = interpolatedColour;
    gl_FragColor.a = 0.55;
}
